public enum SpokenpoItens {
    
    ROCK(0)
    , PAPER(1)
    , SCISSOR(2)
    , SPOCK(3)
    , LIZARD(4);
    
    protected final int value;
    
    private SpokenpoItens(int pValue) {
        this.value = pValue;
    }
    
    public boolean beats(SpokenpoItens pItem) {
        int diff = this.value - pItem.value;
        
        if (diff < 0 && Math.abs(diff) % 2 == 1)
            return false;
        else if (diff > 0 && diff % 2 == 0)
            return false;
        
        return true;
    }

}
