import br.com.dio.persistence.dao.BlockDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.SQLException;

import static org.mockito.Mockito.*;

public class BlockDAOTest {

    private BlockDAO blockDAO;
    private Connection connectionMock;

    @BeforeEach
    public void setup() {
        connectionMock = Mockito.mock(Connection.class);
        blockDAO = new BlockDAO(connectionMock);
    }

    @Test
    public void testBlockCard() throws SQLException {
        String reason = "Suspicious activity";
        Long cardId = 1L;

        when(connectionMock.prepareStatement(anyString())).thenReturn(Mockito.mock(java.sql.PreparedStatement.class));

        blockDAO.block(reason, cardId);

        verify(connectionMock, times(1)).prepareStatement(anyString());
    }

    @Test
    public void testUnblockCard() throws SQLException {
        String reason = "Issue resolved";
        Long cardId = 1L;

        when(connectionMock.prepareStatement(anyString())).thenReturn(Mockito.mock(java.sql.PreparedStatement.class));

        blockDAO.unblock(reason, cardId);

        verify(connectionMock, times(1)).prepareStatement(anyString());
    }
}
