package com.data_structure.hashtable;

class MyHash {
    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;

        public Slot(String value) {
            this.value = value;
        }
    }

    public Integer hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key); // key값 생성
        if (this.hashTable[address] != null) {  // 해당 key값에 값이 있을때
            this.hashTable[address].value = value;  // 새로운 value로 값을 변경해준다.
        } else {
            this.hashTable[address] = new Slot(value);
        }

        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }
}

public class EXHashTable {
    public static void main(String[] args) {
        MyHash hash = new MyHash(10);
        hash.saveData("1", "asd");
        System.out.println(hash.getData("1"));
    }
}
