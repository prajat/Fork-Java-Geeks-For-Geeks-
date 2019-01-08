class Geeks {
    static void empSort(Employee e[], int n) {
        // Your code here
        Arrays.sort(e, new Comparator<Employee>() {
            @Override
            public int compare(Employee p1, Employee p2) {

                if (p1.salary == p2.salary) {
                    return p2.id - p1.id;
                }
                return p2.salary - p1.salary;
            }
        });
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i].name + " " + e[i].salary + " " + e[i].id + " ");
        }

    }
}