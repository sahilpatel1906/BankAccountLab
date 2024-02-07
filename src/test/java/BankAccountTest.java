import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Bob", "The Builder", "19/01/1999");
    }

    @Test
    public void canGetFirstName() {
        //Arrange
        String expected_name = "Bob";
        //ACT
        String actual_name = account.getFirstName();
        //ASSERT
        assertThat(actual_name).isEqualTo(expected_name);
    }

    @Test
    public void canSetFirstName() {
        String expected_name = "Bobby";
        account.setFirstName("Bobby");
        String actual_name = account.getFirstName();
        assertThat(actual_name).isEqualTo(expected_name);
    }

    @Test
    public void canGetLastName() {
        String expected_name = "The Builder";
        String actual_name = account.getLastName();
        assertThat(actual_name).isEqualTo(expected_name);
    }

    @Test
    public void canSetLastName() {
        String expected_name = "Builder";
        account.setLastName(expected_name);
        String actual_name = account.getLastName();
        assertThat(actual_name).isEqualTo(expected_name);
    }

    @Test
    public void canGetDateOfBirth() {
        String expected = "19/01/1999";
        String actual = account.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        String expected = "19/01/2000";
        account.setDateOfBirth("19/01/2000");
        String actual = account.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }
}
