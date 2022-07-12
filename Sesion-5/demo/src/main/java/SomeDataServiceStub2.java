public class SomeDataServiceStub2 implements SomeDataService {


    @Override
    public int[] retrieveAllData() {

        return new int[] { 1, 2, 3 };
    }
}

  class SomeDataServiceEmpyStub implements SomeDataService {


    @Override
    public int[] retrieveAllData() {

        return new int[] { };
    }
}
class SomeDataServiceOneElement implements SomeDataService {


    @Override
    public int[] retrieveAllData() {

        return new int[] {5};
    }
}

