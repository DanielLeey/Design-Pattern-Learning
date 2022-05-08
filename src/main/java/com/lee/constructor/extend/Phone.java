package com.lee.constructor.extend;

public class Phone {

    private String cpu;

    private String screen;

    private String memory;

    private String mainboard;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    private Phone(PhoneBuilder phoneBuilder) {
        this.cpu = phoneBuilder.cpu;
        this.screen = phoneBuilder.screen;
        this.memory = phoneBuilder.memory;
        this.mainboard = phoneBuilder.mainboard;
    }

    public static final class PhoneBuilder {

        private String cpu;

        private String screen;

        private String memory;

        private String mainboard;

        //链式
        public PhoneBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public PhoneBuilder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public PhoneBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public PhoneBuilder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }

    }
}
