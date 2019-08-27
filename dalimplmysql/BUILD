java_library(
    name = "dalimplmysql",
    srcs = glob(["src/main/java/com/augustbonds/dalimplmysql/dalimplmysql/**/*.java"]),
    deps = ["//hops-metadata-dal"],
)

java_test(
    name = "dalimplmysql-test",
    size = "small",
    srcs = glob(["src/test/java/com/augustbonds/dalimplmysql/dalimplmysql/**/*.java"]),
    test_class = "com.augustbonds.dalimplmysql.dalimplmysql.Tests",
    deps = ["@junit_junit//jar", "//hops-metadata-dal", ":dalimplmysql"],
)
