package com.bjpowernode.javase;

public enum MyEnum {
    SUCCESS("zhangsan");
    private String name;
    MyEnum(String name, String zhnagsan) {
    }

    MyEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEnum{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(MyEnum.SUCCESS.getName());
    }
}



