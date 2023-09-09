 class AndroidFactory extends AbstractFactory{
    @Override
    Phone CreateMobile(String model) {
        switch (model) {
            case Phone.OPPO:
                return new OppoReno();
            case Phone.REDMI:
                return new RedmiNote();
            default:
                return null;
        }
    }
}
