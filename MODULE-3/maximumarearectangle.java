class maxArea {

    static int calculate_Area(Rectangle arr[]) {

        // Your code here
        // Arrays.sort(arr);
        int maxarea = 0;

        for (int i = 0; i < arr.length; i++) {
            int area = arr[i].area();
            if (area > maxarea) {
                maxarea = area;
            }
        }
        return maxarea;

    }

}