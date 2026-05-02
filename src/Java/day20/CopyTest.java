package Java.day20;

import Java.day03.People;

public class CopyTest {

    static void main(String[] args) throws Exception {
        Address address = new Address("上海");
        People p1 = new People("001", address);
        People p2 = p1.clone();
        p1.getAddress().setCity("南昌");
        System.out.println( "p1:" + p1.getName()+p1.getAddress().getCity() +"\n" +
                        "p2:"+p2.getName()+p2.getAddress().getCity());
    }


    static class People implements Cloneable {
        private String name;
        private Address address;


        public People() {
        }
        public People(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
        @Override
        protected People clone() throws CloneNotSupportedException {
            People people = (People) super.clone();
            people.setAddress(this.address.clone());
            return people;
        }
    }

    static class Address implements Cloneable {
        private String city;

        public Address() {
        }

        public Address(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }
}
