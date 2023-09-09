public class array {
    public static void main(String[] args){
        //THREE WAYS TO DECLARE AN ARRAY
        //1.DECLARATION AND MEMORY ALLOCATION
        int [] student = new int[5];

        //2. DECLARATION AND THEN MEMORY ALLOCATION
        int marks[];
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 70;
        //marks[6] = 90; This gives an error
        System.out.println(marks[3]);

        //3. DECLARATION , MEMORY ALLOCATION AND INITIALIZATION
        int[] students = {5,7,2,6,7};
    }
}
