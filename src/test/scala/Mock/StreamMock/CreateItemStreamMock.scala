package Mock.StreamMock

import Core.Entity.ItemEntity
import Infrastructure.Stream.CreateItemStream

object CreateItemStreamMock extends CreateItemStream
{
    def getId: Int = 1
    def getTitle: String = "title"
    def getDescription: String = "description"
    def getPrice: Float = 1.11
    def getTags: List[String] = List("tag", "tag")
    def getStock: Int = 1

    def setId(id: Int): Unit = ()
    def setTitle(title: String): Unit = ()
    def setDescription(description: String): Unit = ()
    def setPrice(price: Float): Unit = ()
    def setTags(tags: List[String]): Unit = ()
    def setStock(stock: Int): Unit = ()
}