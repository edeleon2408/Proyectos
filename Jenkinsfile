// comment
pipeline {
 agent any
 stages {
        stage('build') {
          steps {
            echo '******** Realizando la compilacion del proyecto *********'
             bat 'mvn clean compile'             
          }
       }
        stage('test') {            
                  steps {
                       // try{
                            echo '******** Realizando el test del proyecto *********'
                            bat 'mvn verify'
                       /* }catch(err) {
                            if (currentBuild.result == 'UNSTABLE')
                                currentBuild.result = 'FAILURE'
                            throw err
                        }*/
                                 
                  }
        }
        /*stage('Checkout-git'){
               steps{
		git poll: true, url: 'git@github.com:edeleon2408/Proyectos.git'
               }
        }
        /*stage('CreateVirtualEnv') {
            steps {
				sh '''
					bash -c "virtualenv entorno_virtual && source entorno_virtual/bin/activate"
				'''

            }
        }
        stage('InstallRequirements') {
            steps {
            	sh '''
            		bash -c "source ${WORKSPACE}/entorno_virtual/bin/activate && ${WORKSPACE}/entorno_virtual/bin/python ${WORKSPACE}/entorno_virtual/bin/pip install -r requirements.txt"
                '''
            }
        }   
        stage('TestApp') {
            steps {
            	sh '''
            		bash -c "source ${WORKSPACE}/entorno_virtual/bin/activate &&  cd src && ${WORKSPACE}/entorno_virtual/bin/python ${WORKSPACE}/entorno_virtual/bin/pytest && cd .."
                '''
            }
        }  
        stage('RunApp') {
            steps {
            	sh '''
            		bash -c "source entorno_virtual/bin/activate ; ${WORKSPACE}/entorno_virtual/bin/python src/main.py &"
                '''
            }
        } 
        stage('BuildDocker') {
            steps {
            	sh '''
            		docker build -t apptest:latest .
                '''
            }
        } 
    stage('PushDockerImage') {
            steps {
            	sh '''
            		docker tag apptest:latest mijack/apptest:latest
					docker push mijack/apptest:latest
					docker rmi apptest:latest
                '''
            }
        } */
  }
}

