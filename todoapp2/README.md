
Module  在 Component 的 build中构造。    module 方法？？

@Component依赖model 生成provide ？？？


2
@Subcomponent  @Component 必须为接口
	@Component 生成 Dagger...Component 继承该接口       				   生成Builder  @Component.Builder 继承注解 					 init对应一个Builder   一个Build 可以绑定参数
	 																	   								可以自定义多个方法传入对象 dagger自动关联注入对象


	@Subcomponent  在@Component 中生成 Impl  继承该接口  @Subcomponent    生成Builder 继承注解 	 @Subcomponent.Builder			 init对应一个Builder	 一个Build 可以绑定参数

Component 抽象类会生成



Subcomponent 生成Builder  类名+builder


@Component 和 @Subcomponent 都要传注入的对象 ！！！


1 @Module 中的抽象方法 Dagger...Component  中实现




 @Binds 必须有一个入参

@Module 中可以使用 @ContributesAndroidInjector  相当于 @Module  对外提供一个 AndroidInjector.Factory<? extends T> 并subcomponents

Subcomponent 如果是抽象类 主 component 中 将会生成 该类的imp类 实现 具体方法


1.@Module  对于每条@Provides 都会构建独立的类。具体名字 “类名” + “_Provide_” + “返回类”+“Factory”

2.@Module 中的 @Provides 如果是具体方法  Provides 类会 通过实例调用 如果是接口 想下寻找



@Module 是抽象类时 生成 抽象类Impl  以及 Builder  具体抽象方法



Component 中的 Builder会构建包含的Module



 在@Module 中使用 @ContributesAndroidInjector 后会生成 “model类” + “接口” 的model



 Module 是抽象类