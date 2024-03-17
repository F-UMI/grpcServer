#!/bin/bash

# Step 1: artifacts/channel 디렉토리로 이동
cd ~/capstone-project-anbang/anbang-network/artifacts/channel || exit

# Step 2: ./GC.sh cryptogens 실행
./GC.sh cryptogens

# Step 3: ./GC.sh configtxgens 실행
./GC.sh configtxgens

# Step 4: docker-compose가 존재하는 디렉토리로 이동
cd ../ || exit

# Step 5: docker-compose up -d 실행
docker-compose up -d

# Step 6: channel 디렉토리로 이동
cd channel || exit

# Step 7: ./CC.sh createChannel 실행
./CC.sh createChannel

# Step 8: ./CC.sh joinChannel 실행
./CC.sh joinChannel

# Step 9: ./CC.sh updateAnchorPeers 실행
./CC.sh updateAnchorPeers

echo "Blockchain network setup completed successfully."