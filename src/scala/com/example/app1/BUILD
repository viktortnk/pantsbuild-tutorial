scala_library(
    name='main-lib',
    dependencies=[
        'src/scala/com/example/greeter',
        '3rdparty:sparkjava',
    ]
)

jvm_binary(
    name='main-bin',
    main='com.example.app1.Main',
    dependencies=[
        ':main-lib',
        '3rdparty:logback',
    ]
)