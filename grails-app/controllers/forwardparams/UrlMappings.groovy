package forwardparams

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/firstAction"(controller: 'demo', action: 'first')
        "/secondAction"(controller: 'demo', action: 'second')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
