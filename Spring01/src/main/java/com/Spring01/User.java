@Entity
public class User{
        @id
        @GeneratedValue(strategy =Generation.IDENTITY)
    private Long id;
     @NotBlank
    String name;
    
    private String email;
}