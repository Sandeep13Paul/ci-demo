@Library('ci-cd-library') _

ciPipeline(
    mavenTool   : 'jenkins-maven',
    dockerCreds : 'dockerhub-credentials',
    dockerRepo  : 'sandeeppaul/my-repo',
    mavenDir    : 'demo3',
    appVersion  : '1.1.2'   // or pass from Jenkins build parameter
)
