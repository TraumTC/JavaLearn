package ShiYan;

import java.util.*;

public class LLTest {
    private static final String[] terminals = {"i", "+", "*", "(", ")", "#"};
    private static final String[] nonTerminals = {"E", "E'", "T", "T'", "F"};

    private static final Map<String, Map<String, String>> parseTable = new HashMap<>();

    static {
        for (String nt : nonTerminals) {
            parseTable.put(nt, new HashMap<>());
        }
        parseTable.get("E").put("i", "TE'");
        parseTable.get("E").put("(", "TE'");
        parseTable.get("E'").put("+", "+TE'");
        parseTable.get("E'").put(")", "ε");
        parseTable.get("E'").put("#", "ε");

        parseTable.get("T").put("i", "FT'");
        parseTable.get("T").put("(", "FT'");

        parseTable.get("T'").put("+", "ε");
        parseTable.get("T'").put("*", "*FT'");
        parseTable.get("T'").put(")", "ε");
        parseTable.get("T'").put("#", "ε");

        parseTable.get("F").put("i", "i");
        parseTable.get("F").put("(", "(E)");
    }
//判断终结符
    private static boolean isTerminal(String symbol) {
        for (String t : terminals) {
            if (t.equals(symbol)) return true;
        }
        return false;
    }
//拆解符号
    private static List<String> splitSymbols(String production) {
        List<String> symbols = new ArrayList<>();
        int i = 0;
        while (i < production.length()) {
            char c = production.charAt(i);
            if (c == 'E' || c == 'T') {
                if (i + 1 < production.length() && production.charAt(i + 1) == '\'') {
                    symbols.add(c + "'");
                    i += 2;
                } else {
                    symbols.add(String.valueOf(c));
                    i++;
                }
            } else {
                symbols.add(String.valueOf(c));
                i++;
            }
        }
        return symbols;
    }

    public static void parse(String input) {
        Stack<String> stack = new Stack<>();
        stack.push("#");
        stack.push("E");

        int index = 0;
        System.out.println("==== 预测分析过程 ====");
        System.out.printf("%-15s %-15s %-20s\n", "分析栈", "剩余串", "动作");
        while (!stack.isEmpty()) {
            String top = stack.peek();
            String current = String.valueOf(input.charAt(index));
            if (current.equals("i")) {
                current = "i";
            }
            if (isTerminal(top)) {
                if (top.equals(current)) {
                    System.out.printf("%-15s %-15s %-20s\n", stack, input.substring(index), "匹配 " + top);
                    stack.pop();
                    index++;
                } else {
                    System.out.println("错误：终结符不匹配，分析失败");
                    return;
                }
            } else if (top.equals("#")) {
                if (current.equals("#")) {
                    System.out.printf("%-15s %-15s %-20s\n", stack, input.substring(index), "接受");
                    stack.pop();
                } else {
                    System.out.println("错误：栈顶为#但输入未结束");
                    return;
                }
            } else {
                String production = parseTable.get(top).get(current);
                if (production == null) {
                    System.out.println("错误：无匹配产生式，分析失败");
                    return;
                }
                System.out.printf("%-15s %-15s %-20s\n", stack, input.substring(index), top + " → " + production);
                stack.pop();

                if (!production.equals("ε")) {
                    List<String> symbols = splitSymbols(production);
                    for (int i = symbols.size() - 1; i >= 0; i--) {
                        stack.push(symbols.get(i));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== LL(1) 预测分析器 ====");
        System.out.println("请输入带#的表达式（如 i+i*i#）：");
        String input = sc.nextLine().trim();
        parse(input);
        sc.close();
    }
}
