import javax.annotation.processing.Generated;

@Entity
public class Order{
   @Id
   @GeneratedValue(strategy=GenrationType.IDENTITY)
    private Long id;

    private String product;

   @ManyToOne
   @JoinColumn(name="user-id")
    private User user;
}