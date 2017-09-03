scala_library(
    name='main-lib',
    dependencies=[
        '3rdparty:commons-lang3',
    ]
)

jvm_binary(
    name='main-bin',
    main='com.example.app1.Main',
    dependencies=[
        ':main-lib',
    ]
)