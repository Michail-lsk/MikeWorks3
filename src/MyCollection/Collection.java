package MyCollection;

public class Collection {

    private String[] array = new String[10];
    private int size = 0;

    public void add(String name) {
        array[size] = name;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

    }

    public void erase(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else
            System.out.println("This index outside value");
    }

    public void eraseString(String s) {
                int number = -1;
                for (int i = 0; i < array.length; i++) {
                    if (s.equals(array[i])) {
                        number = i;
                    }
            }
            if (number != -1) {
            erase(number);
            }
        }



            public void ShowArray () {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(i);
                }
            }

            public int getSize () {
                return size;
            }

            public String getName ( int i){
                return array[i];
            }

            public int getLength () {
                return array.length;
            }


        }
