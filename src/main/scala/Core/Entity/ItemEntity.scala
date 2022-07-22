package Core.Entity

case class ItemEntity(
    id: Int,
    title: String,
    description: String,
    price: Float,
    tags: List[String],
    stock: Int
)

object ItemEntity
{
    def createItem(
        id: Int,
        title: String,
        description: String,
        price: Float,
        tags: List[String],
        stock: Int
    ): ItemEntity =
    {
        ItemEntity(
            id,
            title,
            description,
            price,
            tags,
            stock
        )
    }
}