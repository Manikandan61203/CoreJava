package OptionalToHandleStringNull;

import java.util.Optional;

public class OptionalToHandleStringNull {
    public OptionalToHandleStringNull() {
        String s[]={"Optional Class",null};
        for(String i:s)
        {
            Optional<String> os=Optional.ofNullable(i);
            if(os.isPresent()){
                System.out.println("String Uppercase :"+os.get().toUpperCase());
            }else {
                System.out.println("Empty input");
            }
        }

    }

    public static void main(String[] args) {
        OptionalToHandleStringNull othsn=new OptionalToHandleStringNull();
    }
}
