package UseCaseTest

import org.scalatest.funsuite.AnyFunSuite

class CreateItemUseCaseTest extends AnyFunSuite
{
    test("test´s if Item can be created with all necessary parts"){

        CreateItemUseCase.execute(
            CreateItemStreamMock,
            ItemRepositoryMock
        )

        assert(CreateItemStreamMock.item == )
    }
}