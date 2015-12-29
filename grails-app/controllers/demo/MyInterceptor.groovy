package demo


class MyInterceptor {

    public MyInterceptor() {
        match uri: '/firstAction'
    }

    boolean after() {
        def forwardParams = [firstName: 'Jeff']

        forward uri: '/secondAction', params: forwardParams

        false
    }
}
