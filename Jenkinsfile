pipeline {
    agent any

    environment {
        // Credentials you created in Jenkins for DockerHub
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-credentials')
        // Replace with your DockerHub username/repo
        DOCKERHUB_REPO = "sandeeppaul/my-repo"
        // Tag version dynamically
        APP_VERSION = "v1.0.${BUILD_NUMBER}"
    }

    stages {
        stage('Checkout from GitHub') {
            steps {
                echo "📥 Cloning GitHub repository..."
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    echo "🐳 Building Docker image from Dockerfile..."
                    sh """
                        docker build -t $DOCKERHUB_REPO:$APP_VERSION -f Dockerfile .
                    """
                }
            }
        }

        stage('Login to DockerHub') {
            steps {
                script {
                    echo "🔑 Logging into Docker Hub..."
                    sh """
                        echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin
                    """
                }
            }
        }

        stage('Push Docker Image to DockerHub') {
            steps {
                script {
                    echo "🚀 Pushing Docker image to DockerHub..."
                    sh """
                        docker push $DOCKERHUB_REPO:$APP_VERSION
                        docker tag $DOCKERHUB_REPO:$APP_VERSION $DOCKERHUB_REPO:latest
                        docker push $DOCKERHUB_REPO:latest
                    """
                }
            }
        }
    }

    post {
        success {
            echo "✅ Docker image successfully built and pushed to DockerHub!"
        }
        failure {
            echo "❌ Build failed. Check the logs properly."
        }
    }
}
