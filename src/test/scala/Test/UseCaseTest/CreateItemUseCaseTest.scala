package Test.UseCaseTest

import org.scalatest.funsuite.AnyFunSuite

import Mock.StreamMock.CreateItemStreamMock
import Mock.RepositoryMock.ItemRepositoryMock
import Core.UseCase.CreateItemUseCase

class CreateItemUseCaseTest extends AnyFunSuite
{
    test("test´s if Item can be created with all necessary parts"){

        val maybeCreatedItem: Either[Throwable, Unit] = CreateItemUseCase.execute(
            CreateItemStreamMock,
            ItemRepositoryMock
        )

        assert(maybeCreatedItem.isRight)
    }
}