scala_library(
    name='main-lib',
    dependencies=[
        'src/scala/com/example/greeter',
        'src/scala/com/example/reverser',
        '3rdparty:sparkjava',
    ]
)

jvm_binary(
    name='main-bin',
    main='com.example.app2.Main',
    dependencies=[
        ':main-lib',
        '3rdparty:logback',
    ]
)