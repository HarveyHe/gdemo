pipeline {
    agent any
    tools {
        maven 'apache-maven' 
    }
    stages {
        stage('args code0') {
            steps {
                
             
                    echo "$GIT_BRANCH"
                    echo env.BRANCH_NAME
                
                
            }
        }
        stage('args code') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'master') {
                        echo 'I only execute on the master branch'
                    } else {
                        echo 'I execute elsewhere'
                    }
                }
                
                sh 'mvn -B -DskipTests clean package' 
             
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
            //post {
              //  always {
                //  junit 'target/surefire-reports/*.xml'
              //  }
            //}
        }
        stage('Cleanup') {
            steps {
                    echo 'Cleanup'
                    cleanWs(deleteDirs: true)
                    //sh 'docker rmi -f $(docker images |grep \'lfs-terminal\'|awk {\'print $3\'})'
            }
        }
    }
}
