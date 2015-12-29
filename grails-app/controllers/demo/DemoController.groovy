package demo

class DemoController {

    def first() { }

    def second() {
        render "First Name: ${params.firstName}"
    }
}
