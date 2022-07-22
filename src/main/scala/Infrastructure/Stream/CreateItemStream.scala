package Infrastructure.Stream

trait CreateItemStream
{
    def getId: Int
    def getTitle: String
    def getDescription: String
    def getPrice: Float
    def getTags: List[String]
    def getStock: Int

    def setId(id: Int): Unit
    def setTitle(title: String): Unit
    def setDescription(description: String): Unit
    def setPrice(price: Float): Unit
    def setTags(tags: List[String]): Unit
    def setStock(stock: Int): Unit
}