package Test.EntityTest

import Core.Entity.ItemEntity
import org.scalatest.funsuite.AnyFunSuite

class ItemEntityTest extends AnyFunSuite
{
    test("test´s if Item.createItem method work´s with all necessary parts"){

        val itemEntity: ItemEntity = ItemEntity.createItem(
            1,
            "title",
            "description",
            1.11,
            List("tag", "tag"),
            1
        )

        assert(itemEntity == ItemEntity(1,"title","description",1.11,List("tag", "tag"),1))
    }
}