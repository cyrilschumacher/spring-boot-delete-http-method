# spring-boot-starter-parent
This project aims to show a problem with the Boot Spring framework. Using the **HTTP DELETE method** associated with an object representing a model (found in method parameters), properties are all NULL.

Why try to put data in the body of the request? I am currently working on a project that demand in the body, identifiers (in addition to the information of the resource has suppressed). The model allows me to isolate (and thus use constraints, if necessary).

## Getting started
### Requirements

- [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (6+)
- [Maven](http://maven.apache.org/) (3.2+)

### How to reproduce the problem?

To begin cloning the directory and open it with your favorite IDE. Download Maven dependencies and run the Spring application.

After the Spring application is executed, execute the following commands **CURL**:
```shell
	curl -X DELETE -H "Cache-Control: no-cache" -H "Content-Type: application/x-www-form-urlencoded" -d 'firstname=John&lastname=Doe' http://localhost:8080/
```

Or pasting the following **HTTP request**:

	DELETE / HTTP/1.1
	Host: localhost:8080
	Cache-Control: no-cache
	Content-Type: application/x-www-form-urlencoded
	
	firstname=John&lastname=Doe

This CURL command will return you the **result of the DELETE resource**:
```json
	{
		"timestamp": 1421952956195,
		"status": 500,
		"error": "Internal Server Error",
		"exception": "java.lang.IllegalArgumentException",
		"message": "No message available",
		"path": "/"
	}
```
The result is the same if you use an **HTTP multipart request**. Against by, if the **with_body** resource is used. No exceptions will be generated.

## Copyright and license

> This is free and unencumbered software released into the public domain.
>
> Anyone is free to copy, modify, publish, use, compile, sell, or
> distribute this software, either in source code form or as a compiled
> binary, for any purpose, commercial or non-commercial, and by any
> means.
>
> In jurisdictions that recognize copyright laws, the author or authors
> of this software dedicate any and all copyright interest in the
> software to the public domain. We make this dedication for the benefit
> of the public at large and to the detriment of our heirs and
> successors. We intend this dedication to be an overt act of
> relinquishment in perpetuity of all present and future rights to this
> software under copyright law.
> 
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
> EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
> MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
> IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
> OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
> ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
> OTHER DEALINGS IN THE SOFTWARE.
>
> For more information, please refer to <http://unlicense.org>
