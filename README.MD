懒加载

一定要在SqlMapConfig.xml在settings配置好

<settings>
    <setting name="lazyLoadingEnabled" value="true"></setting>
    <setting name="aggressiveLazyLoading" value="false"></setting>
</settings>


然后在XXXDao.xml中的一对一或者一对多中的association或者collection标签中
添加select属性，属性的值为要根据另一个查询得到的全限定类名的方法
