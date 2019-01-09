class Geeks {
    static void builder(ArrayList<Integer> arr) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > list.get(i - 1)) {
                list.add(list.get(i - 1));
            } else {
                list.add(arr.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}