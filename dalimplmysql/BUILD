java_library(
    name = "dalimplmysql",
    srcs = glob(["dalimplmysql/**/*.java"]),
    deps = ["//hopsmetadatadal"],
)

java_test(
    name = "dalimplmysql-test",
    size = "small",
    srcs = glob(["test/*.java"]),
    test_class = "com.augustbonds.dalimplmysql.Tests",
    deps = ["@junit_junit//jar", "//hopsmetadatadal", ":dalimplmysql"],
)
