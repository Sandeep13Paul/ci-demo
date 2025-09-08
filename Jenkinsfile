@Library('ci-cd-library') _

ciPipeline(
    mavenTool   : 'jenkins-maven',
    dockerCreds : 'dockerhub-credentials',
    dockerRepo  : 'sandeeppaul/my-repo',
    mavenDir    : 'demo3',
    cdJob       : 'cd-pipeline',
    appVersion  : '1.1.0'   // or pass from Jenkins build parameter
)
