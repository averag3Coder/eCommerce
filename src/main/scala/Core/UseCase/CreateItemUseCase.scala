package Core.UseCase

import Core.Entity.ItemEntity
import Infrastructure.Repository.ItemRepository
import Infrastructure.Stream.CreateItemStream

import scala.util.Try

object CreateItemUseCase
{
    def execute(stream: CreateItemStream, repository: ItemRepository): Either[Throwable, Unit] =
    {
        Try(
            repository.saveOrUpdateItem(
                ItemEntity.createItem(
                    stream.getId,
                    stream.getTitle,
                    stream.getDescription,
                    stream.getPrice,
                    stream.getTags,
                    stream.getStock
                )
            )
        ).toEither
    }
}