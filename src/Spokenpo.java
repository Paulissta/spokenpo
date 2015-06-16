public class Spokenpo {

    public static SpokenpoItens checkWinner(SpokenpoItens pItem1, SpokenpoItens pItem2) {
        if (pItem1 == null || pItem2 == null)
            return null;
        
        if (pItem1.value == pItem2.value)
            return null;
        
        if (!pItem1.beats(pItem2))
            return pItem2;
        
        return pItem1;
    }

}
