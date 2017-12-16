pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('args code') {
            steps {
                echo '${branch}'
            }
        }
        stage('code') {
            steps {
                echo 'code'
                //git 'https://github.com/HarveyHe/gdemo.git'
            }
        }
        stage('Deliver for development') {
            when {
                branch 'dev'
            }
            steps {
                echo 'dev'
                
            }
        }
        stage('Deploy for production') {
            when {
                branch 'patch-1'
            }
            steps {
                echo 'patch-1'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                  junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
