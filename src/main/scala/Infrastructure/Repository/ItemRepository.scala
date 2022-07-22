package Infrastructure.Repository

import Core.Entity.ItemEntity

trait ItemRepository
{
    def saveOrUpdateItem(itemEntity: ItemEntity): Unit
}