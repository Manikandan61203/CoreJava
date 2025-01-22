package OptionalWithDefaultValues;

import java.util.Optional;

public class OptionalWithDefaultValues {
    public OptionalWithDefaultValues() {
        String name[]={"Manikandan",null};
        for(String i:name) {
            Optional<String> os = Optional.ofNullable(i);
            String r=os.orElse("Guest");
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        OptionalWithDefaultValues owdv=new OptionalWithDefaultValues();
    }
}
