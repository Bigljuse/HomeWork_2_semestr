package HomeWorks.HomeWork2.HomeWork2_9;

public class Card
{
    private CardColor color = CardColor.values()[0];
    private CardName name = CardName.values()[0];

    Card(CardColor color, CardName name)
    {
        this.color = color;
        this.name = name;
    }

    public CardName GetName() {
        return name;
    }

    public CardColor GetColor() {
        return color;
    }
}
