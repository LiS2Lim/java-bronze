abstract class Questions {
    Questions(String aws) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
        System.out.println(aws);
    }
}
