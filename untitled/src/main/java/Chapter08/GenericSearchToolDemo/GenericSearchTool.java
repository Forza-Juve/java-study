package Chapter08.GenericSearchToolDemo;

public class GenericSearchTool {
    public static <T> int indexOf(T[] array, T target){
        int index = -1;
        if(array == null || array.length == 0){
            return index;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null && target == null){
                index = i;
                break;
            } else if (target != null && target.equals(array[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
}
