package Mock.RepositoryMock

import Core.Entity.ItemEntity
import Infrastructure.Repository.ItemRepository

object ItemRepositoryMock extends ItemRepository
{
    def saveOrUpdateItem(itemEntity: ItemEntity): Unit = ()
}