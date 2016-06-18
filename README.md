# spring-boot-swaggger-demo
#在application.yml中配置相关的信息

```
spring:
  swagger:
    apiinfo:
       title: Spring Boot 测试
       version: 1.0
       description: Spring Boot 测试
       termsOfServiceUrl: www.dingdongcloud.com
       contact: 杭州云贝网络科技有限公司
       license: 云贝
       licenseUrl: www.dingdongcloud.com  
    docket:
       groupName: test
       pathMapping: /
       pathRegex: /.*
```

# 添加api实例

```
@Controller
@RequestMapping("/api/test")
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@ApiOperation(value = "测试接口", notes = "测试接口描述")
	public String show(
			@ApiParam(required = true, name = "name", value = "姓名") @RequestParam(name = "name") String name) {

		return name;
	}
}
```
