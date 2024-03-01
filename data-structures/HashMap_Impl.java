package DataStructure;

import java.util.*;

public class HashMap_Impl {
    static class Hashmap<K, V> {
        private class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public Hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);
            if(dataIndex == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bucketIndex].get(dataIndex);
                data.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                rehash();
            } 
        }
        public int hashFunction(K key) {
            int bucketIndex = key.hashCode();
            return Math.abs(bucketIndex) % N;
        }
        public int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];
            for(int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for(int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i]; // GETTING LINKEDLIST 
                for(int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);
            if(dataIndex == -1) {
                return null;
            } else {
                Node data = buckets[bucketIndex].get(dataIndex);
                return data.value;
            }            
        }
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);
            if(dataIndex == -1) {
                return false;
            } else {
                return true;
            }
        }
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].remove(dataIndex);
                return node.value;
            }
        }
    }
    public static void main(String[] args) {
        Hashmap<String, Integer> countryInfo = new Hashmap<>();
        countryInfo.put("India", 140);
        countryInfo.put("China", 130);
        countryInfo.put("US", 32);
        countryInfo.put("Russia", 14);

        countryInfo.remove("China");
    }
}