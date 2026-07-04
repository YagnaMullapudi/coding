class GfG {

    void add_Value(HashMap<Integer, Integer> hm, int x, int y) {
        hm.put(x, y);
    }

    int find_value(HashMap<Integer, Integer> hm, int x) {
        if (hm.containsKey(x))
            return hm.get(x);
        return -1;
    }

    int getSize(HashMap<Integer, Integer> hm) {
        return hm.size();
    }

    void removeKey(HashMap<Integer, Integer> hm, int x) {
        hm.remove(x);
    }
}