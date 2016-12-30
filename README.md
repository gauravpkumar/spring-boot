After start the application, I got an error to access http://localhost:8080/person

the error page:

Whitelabel Error Page

This application has no explicit mapping for /error, so you are seeing this as a fallback.

Fri Dec 30 10:15:20 CST 2016
There was an unexpected error (type=Internal Server Error, status=500).
No converter found for return value of type: class com.netease.meta.Person

the stack prints:

2016-12-30 10:15:20.457 ERROR 4654 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is java.lang.IllegalArgumentException: No converter found for return value of type: class com.netease.meta.Person] with root cause

java.lang.IllegalArgumentException: No converter found for return value of type: class com.netease.meta.Person
        at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor.writeWithMessageConverters(AbstractMessageConverterMethodProcessor.java:187) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.handleReturnValue(RequestResponseBodyMethodProcessor.java:174) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite.handleReturnValue(HandlerMethodReturnValueHandlerComposite.java:81) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:132) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:827) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:738) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:897) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:861) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:622) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846) ~[spring-webmvc-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:729) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:230) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52) ~[tomcat-embed-websocket-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:192) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:192) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.springframework.web.filter.HttpPutFormContentFilter.doFilterInternal(HttpPutFormContentFilter.java:89) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:192) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:77) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:192) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:197) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:192) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:165) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:198) ~[tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:108) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:472) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:140) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:79) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:87) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:349) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:784) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:802) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1410) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_111]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_111]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-8.5.6.jar:8.5.6]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_111]
