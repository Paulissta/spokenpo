import static org.junit.Assert.*;

import org.junit.Test;

public class TestSpokenpo {

    @Test
    public void paperBeatsRock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.PAPER, SpokenpoItens.ROCK);
        assertEquals("Paper should beat rock!", result, SpokenpoItens.PAPER);
    }

    @Test
    public void scissorBeatsPaper() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SCISSOR, SpokenpoItens.PAPER);
        assertEquals("Scissor should beat paper!", result, SpokenpoItens.SCISSOR);
    }

    @Test
    public void spockBeatsScissor() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SPOCK, SpokenpoItens.SCISSOR);
        assertEquals("Spock should beat scissor!", result, SpokenpoItens.SPOCK);
    }

    @Test
    public void lizardBeatsSpock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.LIZARD, SpokenpoItens.SPOCK);
        assertEquals("Lizard should beat Spock!", result, SpokenpoItens.LIZARD);
    }

    @Test
    public void rockBeatsLizard() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.ROCK, SpokenpoItens.LIZARD);
        assertEquals("Rock should beat lizard!", result, SpokenpoItens.ROCK);
    }

    @Test
    public void spockBeatsRock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SPOCK, SpokenpoItens.ROCK);
        assertEquals("Spock should beat rock!", result, SpokenpoItens.SPOCK);
    }

    @Test
    public void paperBeatsSpock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.PAPER, SpokenpoItens.SPOCK);
        assertEquals("Paper should beat Spock!", result, SpokenpoItens.PAPER);
    }

    @Test
    public void lizardBeatsPaper() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.LIZARD, SpokenpoItens.PAPER);
        assertEquals("Lizard should beat paper!", result, SpokenpoItens.LIZARD);
    }

    @Test
    public void scissorBeatsLizard() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SCISSOR, SpokenpoItens.LIZARD);
        assertEquals("Scissor should beat lizard!", result, SpokenpoItens.SCISSOR);
    }

    @Test
    public void rockBeatsScissor() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.ROCK, SpokenpoItens.SCISSOR);
        assertEquals("Rock should beat scissor!", result, SpokenpoItens.ROCK);
    }
    
    @Test
    public void paperBeatenByScissor() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.PAPER, SpokenpoItens.SCISSOR);
        assertEquals("Paper should be beaten by scissor!", result, SpokenpoItens.SCISSOR);
    }
    
    @Test
    public void scissorBeatenBySpock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SCISSOR, SpokenpoItens.SPOCK);
        assertEquals("Scissor should be beaten by Spock!", result, SpokenpoItens.SPOCK);
    }
    
    @Test
    public void spockBeatenByLizard() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SPOCK, SpokenpoItens.LIZARD);
        assertEquals("Spock should be beaten by lizard!", result, SpokenpoItens.LIZARD);
    }
    
    @Test
    public void lizardBeatenByRock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.LIZARD, SpokenpoItens.ROCK);
        assertEquals("Lizard should be beaten by rock!", result, SpokenpoItens.ROCK);
    }
    
    @Test
    public void rockBeatenBySpock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.ROCK, SpokenpoItens.SPOCK);
        assertEquals("Rock should be beaten by Spock!", result, SpokenpoItens.SPOCK);
    }
    
    @Test
    public void spockBeatenByPaper() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SPOCK, SpokenpoItens.PAPER);
        assertEquals("Spock should be beaten by paper!", result, SpokenpoItens.PAPER);
    }
    
    @Test
    public void paperBeatenByLizard() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.PAPER, SpokenpoItens.LIZARD);
        assertEquals("Paper should be beaten by lizard!", result, SpokenpoItens.LIZARD);
    }
    
    @Test
    public void lizardBeatenByScissor() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.LIZARD, SpokenpoItens.SCISSOR);
        assertEquals("Lizard should be beaten by scissor!", result, SpokenpoItens.SCISSOR);
    }
    
    @Test
    public void scissorBeatenByRock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SCISSOR, SpokenpoItens.ROCK);
        assertEquals("Scissor should be beaten by rock!", result, SpokenpoItens.ROCK);
    }
    
    @Test
    public void rockTiesRock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.ROCK, SpokenpoItens.ROCK);
        assertNull("Rock against rock should have no winner!", result);
    }
    
    @Test
    public void paperTiesPaper() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.PAPER, SpokenpoItens.PAPER);
        assertNull("Paper against paper should have no winner!", result);
    }
    
    @Test
    public void scissorTiesScissor() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SCISSOR, SpokenpoItens.SCISSOR);
        assertNull("Scissor against scissor should have no winner!", result);
    }
    
    @Test
    public void spockTiesSpock() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.SPOCK, SpokenpoItens.SPOCK);
        assertNull("Spock against Spock should have no winner!", result);
    }
    
    @Test
    public void lizardTiesLizard() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.LIZARD, SpokenpoItens.LIZARD);
        assertNull("Lizard against lizard should have no winner!", result);
    }
    
    @Test
    public void missingFirstItem() {
        SpokenpoItens result = Spokenpo.checkWinner(null, SpokenpoItens.ROCK);
        assertNull("When miss the first item, there is no winner!", result);
    }
    
    @Test
    public void missingSecondItem() {
        SpokenpoItens result = Spokenpo.checkWinner(SpokenpoItens.ROCK, null);
        assertNull("When miss the second item, there is no winner!", result);
    }
    
    @Test
    public void missingBothItems() {
        SpokenpoItens result = Spokenpo.checkWinner(null, null);
        assertNull("When miss both items, there is no winner!", result);
    }

}
